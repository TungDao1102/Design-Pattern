public interface Builder {
    Builder buildName(String name);
    Builder buildPrice(Double price);
    Builder buildInfo(String info);
    Product build();
}
