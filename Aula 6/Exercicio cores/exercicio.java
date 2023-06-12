import java.io.*;

public class exercicio {
	public static void main(String[] args) throws Exception{
		String arqSaida = "Cores.html";
		BufferedWriter arqGravacao = new BufferedWriter(new FileWriter(arqSaida));
		
		String l1,l2;
        int i,j,k;
        String[] hexa={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};

        String linha = "<html><head><title>Tabela de Cores HTML</title><meta http-equiv='Content-Type' content='text/html charset=UTF-8'></head><body><p>&nbsp;</p><h2 align='center'>Tabela de Cores HTML</h2><table width='400' align='center' border='1'><tr><th width='200' align='center'>Cor</th><th width='200' align='center'>Código Hexadecimal</th></tr>";
		arqGravacao.write(linha);
		arqGravacao.newLine();
		
        for (i=0;i < 16;i++) {
            for (j=0;j < 16;j++) {
                for (k=0;k < 16;k++) {
                            l1 = "<tr><td bgcolor='#"+ hexa[i] +"0"+ hexa[j] +"0"+ hexa[k] +"0'></td><td align='center'>#"+ hexa[i] +"0"+ hexa[j] +"0"+ hexa[k] +"0</td></tr>";
                            arqGravacao.write(l1);
                            arqGravacao.newLine();
                }
            }
        }
		
		l2 = "</table></body></html>";
		arqGravacao.write(l2);
		
		arqGravacao.close();
	}
}