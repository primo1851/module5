class Kart:
    def __init__(self, name, cilindradas, velocidadeMaxima):
        self.name = name
        self.cilindradas = cilindradas
        self.velocidadeMaxima = velocidadeMaxima
        self.motor = Motor(cilindradas, velocidadeMaxima)

    def pular(self):
        print("O kart pulou")

    def soltarTurbo(self):
        print("O kart soltou o turbo")

    def fazerDrift(self):
        print("O kart fez um drift")

    def mostraInfo(self):
        print(
            f"O motor tem {self.cilindradas} cilindradas e a velocidade máxima é {self.velocidadeMaxima} Km/h."
        )
        return self.motor


class Motor:
    def __init__(self, cilindradas, velocidadeMaxima):
        self.cilindradas = cilindradas
        self.velocidadeMaxima = velocidadeMaxima
