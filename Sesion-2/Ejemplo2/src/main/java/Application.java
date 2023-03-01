public class Application  {
    public static void main(String[] args)throws Exception{
        StockMarketReport reporte = new StockMarketAdapter();
        String json = reporte.download();

        System.out.println(json);

        AnalysisLibrary library = new AnalysisLibrary();
        library.analyzeInformation(json);
    }
}