import java.math.*;
public class carMichael {
	
	public static BigInteger sqrt(BigInteger x) {
	    BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
	    BigInteger div2 = div;
	    for(;;) {
	        BigInteger y = div.add(x.divide(div)).shiftRight(1);
	        if (y.equals(div) || y.equals(div2))
	            return y;
	        div2 = div;
	        div = y;
	    }
	}

	public static BigInteger power(BigInteger a, BigInteger p, BigInteger n)
    {
		BigInteger b;
		if(p.compareTo(BigInteger.valueOf(0))==0)
			return BigInteger.valueOf(1);
		else if(p.compareTo(BigInteger.valueOf(1))==0)
			return a.mod(n);
		else
		{
			b=power(a,p.divide(BigInteger.valueOf(2)),n);
			b=(b.multiply(b)).mod(n);
			if(p.mod(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(1))==0)
				b=(b.multiply(a).mod(n));
			return b;
		}
    }
	
	public static boolean isCarmichaelNumber(BigInteger n)
	{
		BigInteger a;
		BigInteger s;
		boolean factor_found=false;
		
		if(n.mod(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(0))==0)
			return false;
		
		s= sqrt(n);
		a=BigInteger.valueOf(2);
		if(n.compareTo(BigInteger.valueOf(3))==0)
		{
			return false;
		}
		while(a.compareTo(n)<0)
		{
			if(a.compareTo(s)>0&&factor_found==false)
			{
				return false;
			}
			if(a.gcd(n).compareTo(BigInteger.valueOf(1))>0)
			{
				factor_found=true;
			}
			else
			{
				if(power(a,n.subtract(BigInteger.valueOf(1)),n).compareTo(BigInteger.valueOf(1))!=0)
				{
					return false;
				}
			}
			a=a.add(BigInteger.valueOf(1));
		}
		return true;
	}

	public static void main(String[]args)
	{
		BigInteger beg = BigInteger.valueOf(2);
		String bigIntStr="100000";
		BigInteger stop = new BigInteger(bigIntStr);
		while(stop.compareTo(beg)!=0)
		{
			if(isCarmichaelNumber(beg))
			{
				System.out.println(beg);
			}
			beg=beg.add(BigInteger.valueOf(1));
		}
	}

}
