import java.util.logging.Logger;

class Dec2Hex
{
	private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());
		public static void main(String args[])    
		{
			int Arg1 = parseInteger(args);
			String hexadecimal = convertDecimalToHex(Arg1);
			System.out.println("Hexadecimal representation is: " + hexadecimal);
		}

		public static int parseInteger(String[] args)
		{
                        // If parsed arguments are 0 print instructions to use the command and then return
                        if(args.length != 1 ){
                                logger.info("This command requires 1 argument passed to be executed");
                                throw new IllegalArgumentException("Requires 1 argument to execute");
                        };

                        try{
                                return Integer.parseInt(args[0]);
                        }catch (NumberFormatException e)
                        {
                                logger.warning(e + " is not a valid decimal");
                                throw new NumberFormatException("Invalid Decimal argument");
                        }
		}

		public static String convertDecimalToHex(int decimal)
		{
			char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                        int rem, num;
                        num = decimal;
                        String hexadecimal="";
                        System.out.println("Converting the Decimal Value " + num + " to Hex...");

                        while(num != 0)
                        {
                                rem=num%16;
                                hexadecimal= ch[rem] + hexadecimal;
                                num= num/16;
                        }
			return hexadecimal;
		}
}


