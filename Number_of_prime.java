public int number_of_prime(int input1,int input2){
    int count=0;
    boolean n=true;
    for(int i=input1;i<=input2;i++){
      for(int j=2;j<i;j++){
        if(i%j==0){
          n=false;
          break;
        }
      }
      if(n=true){
        count++;
      }
    }
  return count;
}
  
