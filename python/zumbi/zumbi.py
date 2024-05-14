class Zumbi:
    def __init__(self, nome, idade, cor_pele):
        self.nome = nome
        self.idade = idade
        self.cor_pele = cor_pele
        self.vida = 100

    def atacar(self, alvo):
        print(f"{self.nome} ataca {alvo}!")
        alvo.receber_dano(20)

    def receber_dano(self, dano):
        self.vida -= dano
        if self.vida <= 0:
            print(f"{self.nome} morreu!")
        else:
            print(f"{self.nome} recebeu {dano} de dano. Vida restante: {self.vida}")

    def mostrar_info(self):
        print(
            f"Nome: {self.nome}, Idade: {self.idade}, Cor da pele: {self.cor_pele}, Vida: {self.vida}"
        )


if __name__ == "__main__":
    zumbi1 = Zumbi("Zumbinho", 30, "Verde")
    zumbi2 = Zumbi("Zumbão", 50, "Cinza")

    zumbi1.mostrar_info()
    zumbi2.mostrar_info()

    zumbi1.atacar(zumbi2)
    zumbi2.atacar(zumbi1)

    zumbi1.mostrar_info()
    zumbi2.mostrar_info()
