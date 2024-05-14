class Motor:
    def __init__(self, cilindradas, velocidadeMaxima):
        self.cilindradas = cilindradas
        self.velocidadeMaxima = velocidadeMaxima

    def mostraInfo(self):
        print(
            f"O motor tem {self.cilindradas} cilindradas e a velocidade máxima é {self.velocidadeMaxima} Km/h."
        )
