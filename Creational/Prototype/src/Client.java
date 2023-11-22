public class Client {
    public static void main(String[] args) {
        Product originProduct = new Product("Lenovo 5", 210.5, "AMD Chipset");
        Product cloneProduct = originProduct.clone();
        System.out.print("object gốc: ");
        System.out.println(originProduct);
        System.out.print("object clone: ");
        System.out.println(cloneProduct);
        System.out.print("2 object giống nhau: ");
        System.out.println(originProduct.equals(cloneProduct));
        System.out.print("2 object có cùng địa chỉ ô nhớ: ");
        System.out.println(originProduct == cloneProduct);
    }
}