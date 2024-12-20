package com.xantrix.webapp.views;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.AbstractView;

public abstract class MyAbstractCsvView extends AbstractView 
{
	private static final String CONTENT_TYPE = "text/csv";

	private String url;

	public MyAbstractCsvView() 
	{
		setContentType(CONTENT_TYPE);
	}
	
	@Override
    protected boolean generatesDownloadContent() 
	{
        return true;
    }


    @Override
    protected final void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) 
    throws Exception 
    {
        response.setContentType(getContentType());
        
        buildCsvDocument(model, request, response);
    }



    protected abstract void buildCsvDocument(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response)
            throws Exception;
    
    public void setUrl(String url) 
    {
        this.url = url;
    }

}
