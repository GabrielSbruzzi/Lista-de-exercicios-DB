class Automovel {
    private String modelo;
    private String cor;
    private boolean ligado;

    public Automovel(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        this.ligado = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O " + modelo + " está ligado.");
        } else {
            System.out.println("O " + modelo + " já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O " + modelo + " está desligado.");
        } else {
            System.out.println("O " + modelo + " já está desligado.");
        }
    }
}

class Carro extends Automovel {
    public Carro(String modelo, String cor) {
        super(modelo, cor);
    }

    public void acelerar() {
        if (isLigado()) {
            System.out.println("O carro " + getModelo() + " está acelerando.");
        } else {
            System.out.println("O carro " + getModelo() + " precisa estar ligado para acelerar.");
        }
    }
}

class Moto extends Automovel {
    public Moto(String modelo, String cor) {
        super(modelo, cor);
    }

    public void empinar() {
        if (isLigado()) {
            System.out.println("A moto " + getModelo() + " está empinando.");
        } else {
            System.out.println("A moto " + getModelo() + " precisa estar ligada para empinar.");
        }
    }
}

class Guincho {
    public void carregar(Automovel automovel) {
        if (automovel instanceof Carro) {
            System.out.println("O guincho está carregando o carro " + ((Carro) automovel).getModelo());
        } else if (automovel instanceof Moto) {
            System.out.println("O guincho está carregando a moto " + ((Moto) automovel).getModelo());
        }
    }
}

class CarroAutomático extends Carro {
    private boolean freioPressionado;

    public CarroAutomático(String modelo, String cor) {
        super(modelo, cor);
        this.freioPressionado = false;
    }

    public boolean isFreioPressionado() {
        return freioPressionado;
    }

    public void pressionarFreio() {
        freioPressionado = true;
    }

    @Override
    public void ligar() {
        if (isFreioPressionado()) {
            super.ligar();
        } else {
            System.out.println("O freio precisa estar pressionado para ligar o " + getModelo());
        }
    }
}

class MotoPartidaPedal extends Moto {
    private boolean aceleradorPuxado;

    public MotoPartidaPedal(String modelo, String cor) {
        super(modelo, cor);
        this.aceleradorPuxado = false;
    }

    public boolean isAceleradorPuxado() {
        return aceleradorPuxado;
    }

    public void puxarAcelerador() {
        aceleradorPuxado = true;
    }

    @Override
    public void ligar() {
        if (isAceleradorPuxado()) {
            super.ligar();
        } else {
            System.out.println("O acelerador precisa estar puxado para ligar a " + getModelo());
        }
    }
}

public class automovelHeranca {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", "Azul");
        Moto moto = new Moto("Honda Cg", "Preta");
        Guincho guincho = new Guincho();

        guincho.carregar(carro);
        guincho.carregar(moto);

        carro.ligar();
        carro.acelerar();

        moto.ligar();
        moto.empinar();

        CarroAutomático carroAutomatico = new CarroAutomático("Civic", "Prata");
        carroAutomatico.pressionarFreio();
        carroAutomatico.ligar();
        carroAutomatico.acelerar();

        MotoPartidaPedal motoPartidaPedal = new MotoPartidaPedal("Yamaha", "Verde");
        motoPartidaPedal.puxarAcelerador();
        motoPartidaPedal.ligar();
        motoPartidaPedal.empinar();
    }
}
