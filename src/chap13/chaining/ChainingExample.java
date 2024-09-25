package chap13.chaining;

public class ChainingExample {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza = pizza
                .dough("치즈크러스트")
                .source("토마토")
                .topping("올리브")
                .topping("피망")
                .topping("양파")
                .topping("페퍼로니")
                .topping("새우")
                .topping("모짜렐라치즈")
                .topping("감자")
                .topping("갈릭소스");
    }
}

class Pizza {
    String topping;
    String source;
    String dough;

    Pizza topping(String topping) {
        this.topping = topping;
        return this;
    }

    Pizza source(String source) {
        this.source = source;
        return this;
    }

    Pizza dough(String dough) {
        this.dough = dough;
        return this;
    }
}