import java.util.Scanner;
class IpClass{

	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String ip = sc.nextLine();

    if (isValid(ip)){
        System.out.println("Class "+getIp(ip)+" Address");

    }
    else {
        System.out.println("Invalid Address");

    }
	}
    public static boolean isValid(String ip){
        String ipForms[] = ip.split("\\.");
        if (ipForms.length != 4){
            return false;
        }
        for (String ipForm : ipForms){
            int n = Integer.parseInt(ipForm);
            if ( n<0 || n>255){
                return false;
            }
        }
        return true;
    }
    public static String getIp(String ip){
        String ipForms[] = ip.split("\\.");
        int start = Integer.parseInt(ipForms[0]);
        if (start >=0 && start<=127){
            return "A";
        }
        else if (start >= 128 && start <= 191){
            return "B";
        }
        else if (start >= 192 && start <= 223){
            return "C";
        }
        else if (start >= 224 && start <= 239){
            return "D";
        }
        else if (start >= 240 && start <= 255){
            return "E";
        }
        else
        return "Invalid IP Address";

    }

	}