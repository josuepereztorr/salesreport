package edu.wctc.iface;

import edu.wctc.Sale;

public interface ShippingPolicy {
    void applyShipping(Sale sale);
}
