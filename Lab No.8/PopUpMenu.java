import java.awt.*;  
import java.awt.event.*;  
class PopUpMenu  {  
    PopUpMenu(){ 
        final Frame f= new Frame("Pop Up Menu Example");

        MenuBar mb=new MenuBar();  
        Menu menu=new Menu("Menu");  
        Menu submenu=new Menu("Save As");  
        MenuItem i1=new MenuItem("New");  
        MenuItem i2=new MenuItem("Open");   
        MenuItem i3=new MenuItem("File");  
        MenuItem i4=new MenuItem("New File");  
            
        final PopupMenu popupmenu = new PopupMenu("Edit");   
        MenuItem Save = new MenuItem("Save");  
        Save.setActionCommand("Save");  
        MenuItem New = new MenuItem("New");  
        New.setActionCommand("New");  
        MenuItem Open = new MenuItem("Open");  
        Open.setActionCommand("Open");
        
        popupmenu.add(Save);  
        popupmenu.add(New);  
        popupmenu.add(Open);
        menu.add(i1);  
        menu.add(i2);    
        submenu.add(i3);  
        submenu.add(i4);  
        menu.add(submenu);  
        mb.add(menu);

        f.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {              
                popupmenu.show(f , e.getX(), e.getY());  
            }                 
        });

        f.add(popupmenu);   
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);
        f.setMenuBar(mb);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);

    }

    public static void main(String args[]){  
        new PopUpMenu();  
    }  
}  
