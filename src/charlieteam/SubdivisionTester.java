
package charlieteam;

public class SubdivisionTester
{

	public static void main(String[] args)
	{
		House h1 = new House();
		h1.setBedrooms(3);
		h1.setFamilyRoomArea(300.5);
		h1.setLivingRoomArea(180.3);
		h1.setStyle("Ranch");
		h1.setPlot(1.0);

		House h2 = new House("Colonial", 200, 300, 1, 0.5);
		House h3 = new House("Victorain", 500, 700, 4, 1.5);
		House h4 = new House("Moblie", 100, 150, 1, 0.5);
		House h5 = new House("Colonial", 300, 400, 2, 1.0);

		Subdivision subdivision = new Subdivision();
		subdivision.add(h1);
		subdivision.add(h2);
		subdivision.add(h3);
		subdivision.add(h4);
		subdivision.add(h5);

		System.out.println(subdivision.list());
		System.out.println(subdivision.size());

		System.out.println(subdivision.find("Ranch"));
		System.out.println(subdivision.get(1));

		System.out.println(subdivision.toString());

		for (House element : subdivision.listByArea(750, 1000))
		{
			System.out.println(element);
		}
		for (House element : subdivision.listByBedrooms(2, 4))
		{ // Testing listByBedrooms();
			System.out.println(element);
		}
		System.out.println();
		for (House element : subdivision.listByPlot(1, 2))
		{
			System.out.println(element);
		}
		System.out.println();
		for (House element : subdivision.sortByArea())
		{
			System.out.println(element);
		}
		System.out.println();
		for (House element : subdivision.sortByPlot())
		{
			System.out.println(element);
		}
		System.out.println();
		System.out.println(subdivision.toString());

	}

}
