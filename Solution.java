import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    
    Mobile[] mobiles=new Mobile[n];
    if(n<=0 || n>=100){
        System.out.println("invalid number of mobiles");
    }
    else{
        scanner.nextLine();
        for(int i=0;i<n;i++){
        String modelName = scanner.nextLine().trim();
        String companyName= scanner.nextLine().trim();
        double price = Double.parseDouble(scanner.nextLine().trim());
        mobiles[i]=new Mobile(modelName,companyName,price);
        }
        System.out.println("--------Alan's Mobile Shop--------");
        for(int j=0;j<n;j++){
            System.out.println(mobiles[j]);
        }
    }
        scanner.close();
    }

}
class Mobile{
    private int n;
    private String modelName;
    private String companyName;
    private double price;

    public String getModelName(){
        return modelName;
    }
    public String getCompanyName(){
        return companyName;
    }
    public double getPrice(){
        return price;
    }
    public void setModelName(String modelName ){
        this.modelName=modelName;
    }
    public void setCompanyName(String companyName){
        this.companyName=companyName;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public Mobile(String modelName, String companyName , double price){
        this.modelName=modelName;
        this.companyName=companyName;
        this.price=price;
    }
    @Override
    public String toString(){
        return String.format("%16s\t%16s\t%10f",getModelName(),getCompanyName(),getPrice());
    }
}
