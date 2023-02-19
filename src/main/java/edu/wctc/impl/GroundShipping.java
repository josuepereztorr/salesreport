package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.ShippingPolicy;

public class GroundShipping implements ShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        sale.setShippingCost(29.99);
    }
}
