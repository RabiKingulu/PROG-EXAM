public class PrintProduct {
    private Product productData;

    public PrintProduct(Product productData) {
        this.productData = productData;
    }

    public void generateReport() {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("*****************************************");
        System.out.println("TOTAL PRODUCT SALES: " + productData.GetTotalProductsSold());
        System.out.println("AVERAGE PRODUCT SALES: " + (int) productData.GetAverageProductsSold());
        System.out.println("MOST POPULAR PRODUCT: " + productData.GetMostPopularProduct());
    }
}

