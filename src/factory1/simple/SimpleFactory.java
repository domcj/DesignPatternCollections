package factory1.simple;

import factory1.prod.Broom;
import factory1.prod.Plane;

public class SimpleFactory {

    public Object create(Class<?> clazz) {
        if (clazz.getName().equals(Plane.class.getName())) {
            return createPlane();
        } else if (clazz.getName().equals(Broom.class.getName())) {
            return createBroom();
        }
        
        return null;
    }
    
    private Broom createBroom() {
        return new Broom();
    }
    
    private Plane createPlane() {
        return new Plane();
    }
}
