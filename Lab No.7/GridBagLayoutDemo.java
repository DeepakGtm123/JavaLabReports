import java.awt.*;

class GridBagLayoutDemo{

	GridBagLayoutDemo(){
		Frame f = new Frame("GridBag Layout Demo");

		// For name
		TextField t1 = new TextField("Name:");
		t1.setBounds(5,10,20,30);

		//For Bio
		TextArea a1 = new TextArea("Bio:");  
  		a1.setBounds(50,30,100,100);

  		// For choice of Countries
		Choice c=new Choice();  
        c.setBounds(100,100, 75,75);  
        c.add("Nepal");  
        c.add("India");  
        c.add("China");

  		// For Hobbies
        final Label label = new Label();          
        label.setAlignment(Label.CENTER);  
        label.setSize(400,100);  
        Checkbox checkbox1 = new Checkbox("Dancing");  
        checkbox1.setBounds(100,100, 50,50);  
        Checkbox checkbox2 = new Checkbox("Singing");  
        checkbox2.setBounds(100,125,50,50);
        Checkbox checkbox3 = new Checkbox("Singing");  
        checkbox3.setBounds(100,150,50,50);
        Checkbox checkbox4 = new Checkbox("Singing");  
        checkbox4.setBounds(100,175,50,50);

        // For selection of gender
        final Label label = new Label();          
        label.setAlignment(Label.CENTER);  
        label.setSize(400,100);  
        Checkbox checkbox1 = new Checkbox("Male");  
        checkbox1.setBounds(100,100, 50,50);  
        Checkbox checkbox2 = new Checkbox("Female");  
        checkbox2.setBounds(100,125,50,50);
        Checkbox checkbox3 = new Checkbox("Others");  

        // For list of Programming languages
        List l1=new List(5);  
        l1.setBounds(100,100, 75,75);  
        l1.add("php");  
        l1.add("java");  
        l1.add("c");  
        l1.add("c++");  
        l1.add("python");  
        f.add(l1);
             
        

		f.add(t1);
		f.add(a1);
		f.add(checkbox1);
		f.add(checkbox2);
		f.add(label);
		f.add(c);

		
		f.setSize(1500,1200);
		f.setLayout(null);
		f.setVisible(true);

	}

	public static void main(String[] args){
		new GridBagLayoutDemo();
	}

}
