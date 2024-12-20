package design_patterns.factory;

import design_patterns.model.Smartphone;

public class SmartphoneFactory implements ProductFactory {
    @Override
    public Smartphone createProduct() {
        return new Smartphone("Smartphone", 800.0); // Proporciona valores predeterminados
    }
}
