// compile --> tsc --out app.js TestShape.ts
// run --> node app.js

/// <reference path = "IShape.ts" />
/// <reference path = "Circle.ts" />
/// <reference path = "Triangle.ts" />
namespace Drawing {
  function drawAllShapes(shape: Drawing.IShape) {
    shape.draw();
  }
  drawAllShapes(new Drawing.Circle());
  drawAllShapes(new Drawing.Triangle());
}
