package com.dio.base;

//public class Order {
   // private final String code;

    //public Order(String code) {
    //    this.code = code;
  //  }
 //   @Override
   // public String toString(){
     //   return "Order={"+"code='"+code +"'"+"}";
 //   }
//}

import java.math.BigDecimal;
public class Order {

    private final String code;
    private final int totalValue;

    public Order(String code, BigDecimal totalValue){
        this.code = code;
        this.totalValue = totalValue;

        //public double calculatefee() {
          //  if (totalValue > 100) {
            //    return totalValue * 0.99;
           // }else { return totalValue;
            //}
        }
    }
*/*public double calculatefee() {
    switch (totalValue) {
        case 100:
            return totalValue * 1.99;
        case 200:
            return totalValue *1.99;
            default:
                return totalValue;
    }
}*/