package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Cart {
      private List<Product> products;

      private Shopper person;
      private int shipping;

      public Cart() {
          this.products = new ArrayList<>();
      }

      public int getShipping() {
          return shipping;
      }

      public void setShipping(int shipping) {
          this.shipping = shipping;
      }

      public int numberofItems() {
          return products.size();
      }

      public void addItems(Product product, int quantity) {
          for (int i = 0; i <= quantity-1; i++) {
              products.add(product);
          }
      }

      public void removeItem(String itemName) {
          Product product = findItem(itemName);
          products.remove(product);
      }

      public void getItems() {

          for (int i = 0; i < products.size(); i++)
          {
              System.out.println(products.get(i).getpName());
          }
  }


      public Double selectItems(String itemName , int itemQuantity){
          Product product = findItem(itemName);

          return product.getPrice() * itemQuantity;
      }


      public Product findItem(String name){
          for (Product product : products){
              if (Objects.equals(product.getpName() , name)){
                  return product;
              }
          }
          return null;
      }

      public Double totalPrice(){
          Double price = 0.0;
          for (Product product : products){
              price += product.getPrice();
          }
          return price ;
      }

      public Double totalPricetax(){
          return (totalPrice() + shippingCost(getShipping())) ;
      }

      public double shippingCost(Integer choice){
          if (totalPrice() > 50){
              return 0.0;
          }
          else if (choice == 1)
               {
                  return 10.0;
              }
          else if (choice == 2) {
                  return 25.0;
              }
          return 0.0;
      }

      public double getTax(String state){
          String[] states = {"IL","CA","NY"};
          List stateList = Arrays.asList(states);

          if ( (stateList.contains(state)) )
          {
              return 1.06;
          }
          return 1.0;
      }


  }