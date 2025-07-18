package arrays.medium;

public class BuySellStock {

        public int maxProfit(int[] prices) {
            int minPrice=Integer.MAX_VALUE;
            int maxProfit =0;
            for(int price : prices){
                if(price<minPrice){
                    minPrice= price; //update lowest buying price
                }else if(price-minPrice>maxProfit){
                    maxProfit=price-minPrice; //calculate profit
                }
            }
            return maxProfit;
        }
    }