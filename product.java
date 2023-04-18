 class Product {
    int pcode;
    String pname;
    double price;
    Product (int c,String n,double p){
        pcode=c;
        pname=n;
        price=p;
    }
    void display(){
        System.out.println("Product Details");
        System.out.println("product code -"+pcode);
        System.out.println("product name -"+pname);
        System.out.println("price -"+price);
        System.out.println("---------------------");}
    
        
        public static void main(String args[]) {
        Product[] a;
        a=new Product[3];
        a[0]=new Product(101,"Apple",120);
        a[1]=new Product(102,"Orange",100);
        a[2]=new Product(103,"Grapes",80);
      for(int i=0;i<3;i++){
        a[i].display();
      }
      Product lowest=a[0];
      for (int i=0 ;i<3;i++)
      {
        if(a[i].price<lowest.price){
            lowest=a[i];
        }
      }
      System.out.println();
      System.out.println("Product with lowest price");
      lowest.display();

        }
    
}
