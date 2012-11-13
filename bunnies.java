import java.util.*;

class bunnies{

public static void main(String[] swag){
	
int tot = 0, mBunny[] = new int[13], fBunny[] = new int[13], male = 0;
int female = 0, time = 0, rvbm[] = new int[13], rvbf[] = new int[13];
int rvbmCount = 0, rvbfCount = 0, maleBorn = 0, femaleBorn = 0;
int femaleInfected = 0, maleInfected = 0, maleDie = 0, femaleDie = 0;

System.out.println("Lets start with 5 bunnies:\n");
	
	for(int i = 0; i < 5; i++){
		Random rg = new Random();
		int g = rg.nextInt(2);
		int a = rg.nextInt(11);
		
		if(g == 0){
			mBunny[a]++;
			tot++;
			male++;
			System.out.println("One " + a + " year old male was created");
		}
		else if(g == 1){
			fBunny[a]++;
			tot++;
			female++;
			System.out.println("One " + a + " year old female was created");
		}
	
	
	}
	
	System.out.println("\nThere's now " + male + " male(s) and " + female + " female(s) in the simulator\n");
	
	while(tot > 0){
		time++;
		for(int i = 12; i >= 0; i--){
			if(mBunny[i] >= 0){
				int x = mBunny[i];
				for(int m = 1; m <=x; m++){
					if(i < 11){
					}
					else if(i >= 11){
						tot--;
						male--;
						mBunny[12] = 0;
						mBunny[11] = 0;
						System.out.println("1 male dies of age");
					}
				}
			}
			if(i >= 1){
				mBunny[i] = mBunny[i-1];
			}
		}
		mBunny[0] = 0;
		
		for(int i = 12; i >= 0; i--){
			if(rvbm[i] >= 0){
				int x = rvbm[i];
				for(int m = 1; m <=x; m++){
					if(i < 11){
					}
					else if(i >= 11){
						tot--;
						rvbmCount--;
						rvbm[12] = 0;
						rvbm[11] = 0;
						System.out.println("1 radioactive vampire male dies of age");
					}
				}
			}
			if(i >= 1){
				rvbm[i] = rvbm[i-1];
			}
		}
		rvbm[0] = 0;
		
		for(int i = 12; i >= 0; i--){
			if(fBunny[i] >= 0){
				int x = fBunny[i];
				for(int m = 1; m <=x; m++){
					if(i < 11){
					}
					else if(i >= 11){
						tot--;
						female--;
						fBunny[12] = 0;
						fBunny[11] = 0;
						System.out.println("1 female dies of age");
					}
				}
			}
			if(i >= 1){
				fBunny[i] = fBunny[i-1];
			}
		}
		fBunny[0] = 0;
		
		for(int i = 12; i >= 0; i--){
			if(rvbf[i] >= 0){
				int x = rvbf[i];
				for(int m = 1; m <=x; m++){
					if(i < 11){
					}
					else if(i >= 11){
						tot--;
						rvbfCount--;
						rvbf[12] = 0;
						rvbf[11] = 0;
						System.out.println("1 radioavtive vampire female dies of age");
					}
				}
			}
			if(i >= 1){
				rvbf[i] = rvbf[i-1];
			}
		}
		rvbf[0] = 0;
		
		for(int i = 11; i > 0; i--){
			if(mBunny[i] > 0){
				int x = mBunny[i];
				for(int b = 1; b <= x; b++){
					Random rg = new Random();
					int death = rg.nextInt(100);
					if(death < 20){
						mBunny[i]--;
						male--;
						tot--;
						System.out.println("1 male dies of disease");
					}
				}
			}
		}
		
		for(int i = 11; i > 0; i--){
			if(fBunny[i] > 0){
				int x = fBunny[i];
				for(int b = 1; b <= x; b++){
					Random rg = new Random();
					int death = rg.nextInt(100);
					if(death < 20){
						fBunny[i]--;
						female--;
						tot--;
						System.out.println("1 female dies of disease");
					}
				}
			}
		}
		
		boolean man = false;
		for(int i = 11; i > 2; i--){
			if(mBunny[i] > 0){
				man = true;
				break;
			}
		}
		for(int i = 11; i > 2 && man; i--){
			int x = fBunny[i];
			for (int b = 1; b <= x; b++){
				Random rg = new Random();
				int rvb = rg.nextInt(100);
				int g = rg.nextInt(2);
				if(g == 0 && rvb > 1){
					mBunny[0]++;
					male++;
					tot++;
					maleBorn++;
				}
				else if(g == 1 && rvb > 1){
					fBunny[0]++;
					female++;
					tot++;
					femaleBorn++;
				}
				else if(g == 0 && rvb < 2){
					rvbm[0]++;
					tot++;
					rvbmCount++;
				}
				else if(g == 1 && rvb < 2){
					rvbf[0]++;
					tot++;
					rvbfCount++;
				}
			}
		}
		
		boolean vampire = false;
		for(int i = 11; i > 2; i--){
			if(rvbm[i] > 0){
				vampire = true;
				break;
			}
			else if(rvbf[i] > 0){
				vampire = true;
				break;
			}
		}	
			
		if(vampire == true){
		for(int i = 0; i < 11; i++){
			int x = mBunny[i];
			for(int b = 1; b <= x; b++){
				Random rg = new Random();
				int infected = rg.nextInt(100);
				if(infected < 50){
					rvbmCount++;
					maleInfected++;
				}
			}
		}
		
		for(int i = 0; i < 11; i++){
			int x = fBunny[i];
			for(int b = 1; b <= x; b++){
				Random rg = new Random();
				int infected = rg.nextInt(100);
				if(infected < 50){
					rvbfCount++;
					femaleInfected++;
				}
			}
		}
		}
		
		System.out.println("\nYear " + time + ", " + tot + " bunny/bunnies are in the simulator");
		System.out.println(male + " male(s)");
		System.out.println(female + " female(s)");
		System.out.println(maleBorn + " newborn male(s)");
		System.out.println(femaleBorn + " newborn female(s)");
		System.out.println(maleInfected + " male(s) are infected");
		System.out.println(femaleInfected + " female(s) are infected");
		System.out.println(rvbmCount + " male radioactive vampire(s)");
		System.out.println(rvbfCount + " female radioactive vampire(s)");
		maleBorn = 0;
		femaleBorn = 0;
		maleInfected = 0;
		femaleInfected = 0;
		maleDie = 0;
		femaleDie = 0;
	}
	
	
	
}	
}
