package study.week3.xml.xml.vo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

//@XStreamAlias("Car")
public class Car {
  String NO;
  String ADDR;
  
public String getNO() {
	return NO;
}
public void setNO(String nO) {
	NO = nO;
}
public String getADDR() {
	return ADDR;
}
public void setADDR(String aDDR) {
	ADDR = aDDR;
}
@Override
public String toString() {
	return "Car [NO=" + NO + ", ADDR=" + ADDR + "]";
}
}
