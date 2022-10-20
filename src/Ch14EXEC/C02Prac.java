package Ch14EXEC;
//-------------------------------
//Computer.java
//-------------------------------
//[기능]
//PowerOn(){"전원을 켭니다"}
//PowerOff(){"전원을 끕니다"}
//-------------------------------
//Notebook.java extends Computer
//-------------------------------
//[속성]
//-Owner:String
//-ProductNumber: static int
//[기능]
//setOwner(String name){}
//getOwner(){}
//getProductNumber(){}
//move(){"이동합니다"}
//->생성자를 쓸때마다 ProductNumber 값이 증가 해야함
//->ProductNum의 초기값은 1000으로 설정
//-------------------------------
//Tablet.java extends Notebook()
//-------------------------------
//[속성]
//-PenNumber : String
//[기능]
//Write(){"펜을 씁니다"}
//SetPenNumber(String Pen){}
//getPenNumber(){}
//-------------------------------
//Main 
//-------------------------------
//Notebook Kim = new Notebook();
//Kim.setOwner("김성주");
//System.out.println("소유자:"+Kim.getOwner()+"PN"+Kim.getProductNumber());
//Kim.PowerOn();
//Kim.Move();
//Kim.PowerOff();
//Tablet Lee = new Tablet()
//Lee.setOwner("이승기");
//System.out.println("소유자:"+Lee.getOwner()+"PN"+Lee.getProductNumber());
//Lee.setPenNumber("1-2-3-4");
//Lee.PowerOn();
//Lee.Move();
//Lee.Write();
//Lee.PowerOff();
