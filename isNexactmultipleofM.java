import java.io.*;
import java.util.*;
class Usermaincode{
  public int isMultiple(int input1,int input2){
    if((input1%input2)%2==0){
      return 2;
    }
    else if(input1==0 || input2==0){
      return 3;
    }
    else{
      return 1;
    }
  }
}
