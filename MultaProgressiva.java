public class MultaProgressiva implements ICalculadoraDeMulta {
    @Override
    public double escolhaDeMulta(UsuarioBiblioteca usuario) {
        double multaBase = 0.5;
        double multaTotal = 0.0;

        if (usuario.getDiasAtraso() <= 3) {
            return multaBase * usuario.getDiasAtraso();
        } else {
        for (int i = 1; i <= usuario.getDiasAtraso(); i++) {
            multaTotal += (multaBase * 3);
            if (i % 3 == 0) {
                //Multiplicando o 10% do desconto
                multaBase *= 1.10;

        }
            }
        }

        return multaTotal;
    }


}


