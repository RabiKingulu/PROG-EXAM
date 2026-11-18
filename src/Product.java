public class Product implements IProduct {
    private String[] products;
    private int[][] sales;

    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductsSold() {
        int total = GetTotalProductsSold();
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            count += sales[i].length;
        }
        return (count > 0) ? (double) total / count : 0.0;
    }

    @Override
    public String GetMostPopularProduct() {
        int highestSale = 0;
        String popularProduct = "";

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] > highestSale) {
                    highestSale = sales[i][j];
                    popularProduct = products[i] + " (" + highestSale + ")";
                }
            }
        }
        return popularProduct;
    }
}
