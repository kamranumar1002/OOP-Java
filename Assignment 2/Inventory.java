import java.util.Arrays;

public class Inventory {
    private Products productsList[];
    public int counter = 0;

    public Inventory(int size) {
        if (size > 0)
            this.productsList = new Products[size];
    }

    public boolean addProduct(Object o) {
        if ((Products) o != null)
            if (counter < productsList.length) {
                productsList[counter] = (Products) o;
                counter++;
                return true;
            }
        return false;
    }

    public boolean removeProduct(Object o) {
        for (int i = 0; i < productsList.length; i++) {
            if (productsList[i] != null) {
                if (productsList[i].equals((Products) o)) {
                    productsList[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeProduct(String id) {
        for (int i = 0; i < productsList.length; i++) {
            if (productsList[i] != null) {
                if (productsList[i].getProductID().equals(id)) {
                    productsList[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public void searchProduct(String id) {
        boolean found = false;
        for (Products p : productsList) {
            int i = 0;
            if (p != null)
                if (p.getProductID().equals(id)){
                    System.out.println(p + " at index: " + i++ + "\n");
                    found = true;
                }
        }
        if(found == false)
            System.out.println("Product not found\n");
    }

    public void searchProductByName(String name) {
        boolean found = false;
        for (Products p : productsList) {
            int i = 0;
            if (p != null)
                if (p.getName().equals(name)){
                    System.out.println(p + " at index: " + i++ + "\n");
                    found = true;
                }
        }
        if(found == false)
            System.out.println("Product not found\n");
    }

    public void searchProductByCategory(int categoryId) {
        boolean found = false;
        ProductCategory category = null;
        if (categoryId == 1)
            category = ProductCategory.Electronics;
        else if (categoryId == 2)
            category = ProductCategory.Furniture;
        else if (categoryId == 3)
            category = ProductCategory.Grocerries;
        for (Products p : productsList) {
            int i = 0;
            if (p != null)
                if (p.getCategory().equals(category)){
                    System.out.println(p + " at index: " + i++ + "\n");
                    found = true;
                }
        }
        if(found == false)
            System.out.println("Product not found\n");
    }

    public Products retrieveProduct(Object o) {
        for (int i = 0; i < productsList.length; i++) {
            if (productsList[i] != null) {
                if (productsList[i].equals((Products) o)) {
                    return productsList[i];
                }
            }
        }
        return null;
    }

    public Products retrieveProduct(String id) {
        for (int i = 0; i < productsList.length; i++) {
            if (productsList[i] != null) {
                if (productsList[i].getProductID().equals(id)) {
                    return productsList[i];
                }
            }
        }
        return null;
    }

    public void displayReport() {
        for (Products p : productsList) {
            int i = 0;
            if (p != null)
                System.out.println(p + " at index: " + i++ + "\n");
        }
    }

    public void displayReport(int categoryId) {
        ProductCategory category = null;
        if (categoryId == 1)
            category = ProductCategory.Electronics;
        else if (categoryId == 2)
            category = ProductCategory.Furniture;
        else if (categoryId == 3)
            category = ProductCategory.Grocerries;
        for (Products p : productsList) {
            int i = 0;
            if (p != null)
                if (p.getCategory().equals(category))
                    System.out.println(p + " at index: " + i++ + "\n");
        }
    }

    public boolean updateProduct(String id, double price) {
        for (int i = 0; i < productsList.length; i++) {
            if (productsList[i] != null) {
                if (productsList[i].getProductID().equals(id)) {
                    productsList[i].updateProductPrice(price);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean updateProduct(String id, int stocks) {
        for (int i = 0; i < productsList.length; i++) {
            if (productsList[i] != null) {
                if (productsList[i].getProductID().equals(id)) {
                    productsList[i].updateProductStock(stocks);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "productsList=" + Arrays.toString(productsList) +
                ", counter=" + counter +
                '}';
    }
}
