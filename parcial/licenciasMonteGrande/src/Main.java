public class Main {
    public static void main(String[] args) {
        Conductor conductor1 = new Conductor("virginia", "bruno", 12345678, "23/09/1995");
        Licencia lic1 = new LicenciaAuto(conductor1, "01/01/2020", "01/01/2025", false, false);
        Licencia lic2 = new LicenciaMoto(conductor1, "01/01/2020", "01/01/2025", true, 1000);
        Licencia lic3 = new LicenciaMoto(conductor1, "01/01/2020", "01/01/2025", false, 500);

        System.out.println(lic1.puedeConducirAutopista());
        System.out.println(lic2.puedeConducirAutopista());
        System.out.println( ((LicenciaMoto)lic2).compareTo(lic3) );
    }
}
