package Arvore.ListaArvore.Q1;

    /**
    * Todo caso de recursão em árvore usa objetos como parâmetros, a ideia é percorrer um caminho (esquerda ou direita) até que ele seja null e retorne.
    * Ao definir um elemento, setamos os lados como null novamente
    * A busca serve para evitar que um elemento repetido seja adicionado, percorrendo toda a árvore e comparando até encontrar caso haja. Validar um nó pai, verificar se ele existe. E buscar um elemento na arvore (método público);
    */
public class ArvoreBinaria {
	private No raiz;

    //Construtor
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	//Método que obtém a raiz
	public void getRaiz() {
		if (vazia()){
			System.out.println("A árvore está vazia!");
			return;
		}
		System.out.println("Raiz: " + raiz.getDado());
	}
    
    // Método que obtém os filhos (nodo grau 0)
    // Verifica se o nodo é diferente de null
	public void getFilhos() {
		if (vazia()){
			System.out.println("A árvore está vazia!");
			return;
		}

		if (raiz.getEsq() != null) {
            System.out.println("Filho esquerdo: " + raiz.getEsq().getDado());
        } else {
            System.out.println("Filho esquerdo: null");
        }
        
        if (raiz.getDir() != null) {
            System.out.println("Filho direito: " + raiz.getDir().getDado());
        } else {
            System.out.println("Filho direito: null");
        }
	}
    
    // Insere a raiz
	public boolean insereRaiz(int dado) { 
		if (raiz != null) {
			return false;
		}

		No novoNo = new No();
		novoNo.setDado(dado);
		novoNo.setEsq(null);
		novoNo.setDir(null);
		
		raiz = novoNo;
		return true;
	}
    
    /**
    * Insere um elemento à esquerda
    * O primeiro parâmetro é sempre o "pai" (nodo que está acima) e o segundo é o que você deseja inserir
    */
	public boolean insereEsquerda(int nPai, int nFilho) {	
		No filho = busca(nFilho);
		if(filho != null) {
			return false; 
		}
		
		No pai = busca(nPai);
		if (pai == null)
			return false; 

		if (pai.getEsq() != null) {
			return false;
		}

		No novoNo = new No();
		novoNo.setDado(nFilho);
		novoNo.setEsq(null);
		novoNo.setDir(null);
		
		pai.setEsq(novoNo);
		return true;
	}
	
	// Insere à direita com a mesma lógica da esquerda
	public boolean insereDireita(int nPai, int nFilho) {
		No filho = busca(nFilho);
		if (filho != null) {
			return false; 
		}
		
		No pai = busca (nPai);
		if (pai == null)
			return false;

		if (pai.getDir() != null) {
			return false;
		}
		No novoNo = new No();
		novoNo.setDado(nFilho);
		novoNo.setEsq(null);
		novoNo.setDir(null);
		
		pai.setDir(novoNo);
		return true;
		
	}
	
	//Verifica se a árvore é vazia
    public boolean vazia() {
		return (raiz == null);
	}
    
    // Método busca público que define a recursão e é chamado no main
	public No busca(int valor) {
		if (vazia()) {
		    return null;
        }
		return busca(raiz, valor);
	}
	
	/**
    * O método de busca tem dois casos bases, ele vai realizar a recursão passando um lado como parâmetro, quando chegar no fim, seta como null e reinicia indo para o outro lado.
    * Como temos dois metodos com o mesmo nome, o público é chamado no main, enquanto o que realiza a função principal é privado.
    */
	private No busca(No T, int valor) {
		if (T == null) {
			return null;
		}
		
		if (T.getDado() == valor) {
			return T;
		}
		
		No aux = busca(T.getEsq(), valor);
		if (aux == null) {
			aux = busca(T.getDir(), valor);
        }
		return aux;
	}
	
	/**
    * Ordem: RAIZ -> ESQUERDA -> DIREITA
    * Todos os métodos de exibição seguem a lógica de ter um público e um privado, da mesma maneira que a busca(), o que muda é a posição do print.
    * O print é a posição da raiz, então nesse caso ele vem antes da recursão.
    */
	public void exibePreOrdem() {
		if (raiz == null) {
			System.out.println("A árvore está vazia!");
        } else {
			exibePreOrdem(raiz);
        }
	}
	// Método privado 
	private void exibePreOrdem(No T) {
		if (T == null) {
			return;
        }   
        System.out.print(T.getDado()+" ");

		if (T.getEsq() != null) {
			exibePreOrdem(T.getEsq());
		}

		if(T.getDir() != null) {
			exibePreOrdem(T.getDir());
		}
	}
    
    /**
    * Ordem: ESQUERDA -> DIREITA -> RAIZ
    * O print é a posição da raiz, então nesse caso ele vem depois das recursões.
    */
    public void exibePosOrdem() {
		if (raiz == null) {
			System.out.println("A árvore está vazia!");
        } else {
			exibePosOrdem(raiz);
        }
	}
	
    // Método privado
    private void exibePosOrdem(No T) {
		if (T == null) {
			return;
        }   

		if (T.getEsq() != null) {
			exibePosOrdem(T.getEsq());
		}

		if(T.getDir() != null) {
			exibePosOrdem(T.getDir());
		}
		System.out.print(T.getDado()+" ");
	}

    /**
    * Ordem: ESQUERDA -> RAIZ -> DIREITA
    * O print é a posição da raiz, então nesse caso ele vem no meio das recursões.
    */
    public void exibeCentral() {
		if (raiz == null) {
			System.out.println("A árvore está vazia!");
        } else {
			exibeCentral(raiz);
        }
	}
    
    // Método privado
    private void exibeCentral(No T) {
		if (T == null) {
			return;
        }   
        
		if (T.getEsq() != null) {
			exibeCentral(T.getEsq());
		}
        System.out.print(T.getDado()+" ");
		
		if(T.getDir() != null) {
			exibeCentral(T.getDir());
		}
	}
    
    /**
    * O método de listar as folhas (nodo de grau 0) segue a lógica do método busca().
    * Ele verifica se o elemento é null (não tem filhos) e realiza a recursão.
    */
	public void listaFolhas() {
        if (vazia()) {
            System.out.println("A árvore está vazia!");
            return;
        }
        listaFolhas(raiz);
    }
    
    // Método privado
    private void listaFolhas(No T) {
        if (T == null) {
            return;
        }
        
        if (T.getEsq() == null && T.getDir() == null) {
            System.out.print(T.getDado()+ " ");
        }
        
        if (T.getEsq() != null) {
            listaFolhas(T.getEsq());
        }
        
        if (T.getDir() != null) {
            listaFolhas(T.getDir());
        }
    }
}
