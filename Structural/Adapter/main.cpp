#include <iostream>

using namespace std;

class Rectangle {
public:
    int x1, y1, x2, y2;
public:
    Rectangle(int _top = 0, int _left = 0, int _bottom = 0, int _right = 0) {
        x1 = _top; 
        y1 = _left;
        x2 = _bottom; 
        y2 = _right;
    }
    void drawRectangle() {
        cout << "Rectangle:" << endl;
        cout << "(" << x1 << ", " << y1 << ") - (" << x2 << ", " << y2 << ")" << endl;
    }
};

class Box {
protected:
    int x, y;
    int width, height;
public:
    Box(int _top = 0, int _left = 0, int _width = 0, int _height = 0) {
        x = _top;
        y = _left;
        width = _width;
        height = _height;
    }
    void drawBox() {
        cout << "Box:" << endl;
        cout << "(" << x << ", " << y << ")" << endl;
        cout << "Width: " << width << " - Height: " << height << endl;
    }
};

class RectangleAdapter: public Box {
private:
    Rectangle* rectangle;
public:
    RectangleAdapter(Rectangle* _rectangle):  
        Box(_rectangle->x1, _rectangle->y1, _rectangle->x2 - _rectangle->x1, _rectangle->y2 - _rectangle->y1) {
            this->rectangle = _rectangle;
        }
    
    void draw() {
        drawBox();
    }
};

class V {
    virtual void xyz() = 0;
};

int main() {
    Rectangle* x = new Rectangle(1, 2, 3, 5);
    Box* y = new Box(7, 4, 9, 3);
    Box* b = new RectangleAdapter(x);
    x->drawRectangle();
    y->drawBox();
    RectangleAdapter r(x);
    r.draw();
    delete x;
    delete y;

    
    return 0;
}