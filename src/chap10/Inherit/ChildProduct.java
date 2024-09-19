package chap10.Inherit;

import chap09.inherit.Child;

public class ChildProduct<T, M, C> extends Product<T, M> {
    private C company;

    ChildProduct(T kind, M model, C company) {
        super(kind, model);
        this.company = company;
    }

    public C getCompany() {
        return company;
    }


}
