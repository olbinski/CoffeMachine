package View.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class MyMenuSub extends MyMenuItem{


    private ArrayList<MyMenuItem> v_submenus = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);


   public MyMenuSub(String Name, String Command)
    {
        super(Name, Command);

    }



    public void run()
    {
        while (true) {
//            cout << sPath << ">" << s_command << endl; //swoja nazwa i komenda
            System.out.println(">" + name);

            for (int i = 0; i < v_submenus.size(); i++) {
                System.out.println(v_submenus.get(i).toString());
            } // wyswietla wszytkie w wektorze

            String input = scan.next();


//            getline(std::cin, s_input); // pobieranie komendy od użytkownika. TODO: Do poprawy na sensowne pobieranie
            //poszukiwanie komendy :


            if (input.equals("back")) {
                return;  // wyszyść ekran i zwróć
            }
            boolean b_find = false;
            for (int i = 0; i < v_submenus.size(); i++) {
                if (input.equals(v_submenus.get(i).getCommand())) {
                    b_find = true;
                    v_submenus.get(i).run();  // uruchom metodę dla itemu w ArrayList
                }
            }

            if (!b_find) {
                System.out.println("Command not found");
            }
        }
    }


    public boolean addSubMenu(MyMenuItem obj)
    {
        v_submenus.add(obj);
        return true;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
