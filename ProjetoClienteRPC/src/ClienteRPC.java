import java.net.URL;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class ClienteRPC {

    private XmlRpcClient cliente;
	
    public ClienteRPC(String urlServidor) {
		try {
			//configura o cliente para que ele possa se conectar ao servidor
			XmlRpcClientConfigImpl configuracaoCliente = new XmlRpcClientConfigImpl();
            configuracaoCliente.setServerURL(new URL(urlServidor));
			//seta a configuração no cliente
            cliente = new XmlRpcClient();
            cliente.setConfig(configuracaoCliente);
        } catch (Exception exception) {
            System.err.println("JavaServer: " + exception);
        }
    }

    public int somar(int x, int y) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Integer resultado = (Integer) cliente.execute("Calc.adicao", parametros);
        return resultado;
    }

    public int subtrair(int x, int y) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Integer resultado = (Integer) cliente.execute("Calc.subtracao", parametros);
        return resultado;
    }

    public int multiplicar(int x, int y) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Integer resultado = (Integer) cliente.execute("Calc.multiplicacao", parametros);
        return resultado;
    }

    public double dividir(int x, int y) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Double resultado = (Double) cliente.execute("Calc.divisao", parametros);
        return resultado;
    }

    //Desenvolver a implementação
    public int calcularAreaQuadrada(int x) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Integer resultado = (Integer) cliente.execute("Calc.areaQuadrado", parametros);
        return resultado;
    }

    public double calcularAreaTrianguloRetangulo(int x, int y) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Double resultado = (Double) cliente.execute("Calc.areaTrianguloRetangulo", parametros);
        return resultado;
    }

    public double calcularAreaCircunferencia(int x) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.areaCircunferencia", parametros);
        return resultado;
    }

    public double calcularAreaEsfera(int x) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.areaEsfera", parametros);
        return resultado;
    }

    public double calcularVolumeEsfera(int x) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.volumeEsfera", parametros);
        return resultado;
    }

    public double calcularAreaCilindro(int x, int y) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Double resultado = (Double) cliente.execute("Calc.areaCilindro", parametros);
        return resultado;
    }

    public double calcularVolumeCilindro(int x, int y) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
        Double resultado = (Double) cliente.execute("Calc.volumeCilindro", parametros);
        return resultado;
    }

    public int calcularAreaSuperficieCubo(int x) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Integer resultado = (Integer) cliente.execute("Calc.areaSuperficieCubo", parametros);
        return resultado;
    }

    public int calcularVolumeCubo(int x) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(x)};
        Integer resultado = (Integer) cliente.execute("Calc.volumeCubo", parametros);
        return resultado;
    }
}







