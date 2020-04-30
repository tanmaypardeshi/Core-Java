//validation of email id

class Prog76
{
	public static void main(String args[])
	{
		String email = args[0];
		
		int pos_1at = email.indexOf('@');
		
		if(pos_1at == -1)
			System.out.println("Missing @, invalid email");
		else
		{
			//check for presence of multiple @
			int pos_2at = email.indexOf('@', pos_1at+1);
			
			if(pos_2at != -1)
				System.out.println("Multiple @, invalid email");
			else
			{
				if(pos_1at == 0)
					System.out.println("Missing username, invalid emailid");
				else
				{
					int pos_dot_afat = email.indexOf('.',pos_1at+1);
					if(pos_dot_afat == pos_1at+1)
						System.out.println("Missing username, invalid email");
					else
					{
						if(pos_dot_afat == -1)
							System.out.println("Missing Domain, Invalid email");
						else
						{
							//domain must contain min 2 chars
							String domain = email.substring(pos_dot_afat +1);
							
							if(domain.length()<2)
								System.out.println("Invalid domain, invalid emailid");
							else
								System.out.println("Email id seems to be valid");
						}
					}
				}
			}
		}
	}
}
