package com.ljw.dp.structure.composite;

import java.util.ArrayList;

public class Composite extends Component {
    private ArrayList<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name, 0);
    }

    public Composite add(Component component) {
        components.add(component);
        return this;
    }

    @Override
    public int getPrice() {
        int sum = 0;
        for (Component component : components) {
            sum += component.getPrice();
        }
        return sum;
    }
}
