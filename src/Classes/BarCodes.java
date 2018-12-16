package Classes;

import java.awt.Image;

public class BarCodes {

    private Image barcode;

    public BarCodes() {
    }

    public BarCodes(Image barcode) {
        this.barcode = barcode;
    }

    public void setBarcode(Image barcode) {
        this.barcode = barcode;
    }

    public Image getBarcode() {
        return barcode;
    }

}

//class A {
//
//    generateReports("StudentDetail", reportFactory.returnStudentsBySchool(s.getSchID()), param);
//
//
//Map<String, Object> param = new HashMap<String, Object>();
//
//
//
//public static Collection returnStudentsBySchool(int schid) {
//
//        educationSSSSessionRemote session = lookupnewEducateFacadeBean();//session beans
//
//        List data = null;
//
//        List<StudentDetail> results = null;
//
//        data = session.findStudentBySchool(schid);// returns the students object with blob
//
//        ListIterator<StudentDetail> lstmb = data.listIterator();
//
//        results = new ArrayList<StudentDetail>();
//
//// converting the byte[] to image type for all the student objects
//        ImageIcon n;
//
//        while (lstmb.hasNext()) {
//
//            StudentDetail s = lstmb.next();
//
//            if (s.getPicture() != null) {
//
//                n = new ImageIcon((byte[]) s.getPicture());
//
//            } else {
//
//                n = new ImageIcon();
//
//            }
//
//            s.setPhoto(n.getImage(),results.add(s);
//
//        }
//
//        return results;
//
//    }
//
//    private void generateReports(String name, Collection data, Map param) {
//
//        try {
//
//            URL urlfilename = null;
//
//            String oSource = "reports/" + name;
//
//            String rSource = "reports/" + name + ".jasper";
//
//            urlfilename = getClass().getResource(rSource);
//
//            String reportfile = null;
//
//            if (urlfilename != null) {
//
//                reportfile = urlfilename.getPath();
//
//            } else {
//
//                return;
//
//            }
//
//            JRBeanCollectionDataSource jrbc = new JRBeanCollectionDataSource(data);
//
//            JasperPrint jasperPrint = JasperFillManager.fillReport(reportfile, param, jrbc);
//
//            JasperViewer.viewReport(jasperPrint, false);//"
//
//// when the false is absent on closing the report it closes your java apllication
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//            System.out.println("reports Error  " + e.toString());
//
//        }
//    }
//}
