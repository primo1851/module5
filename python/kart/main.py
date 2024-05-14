from kart import Kart
from piloto import Piloto


def main():
    kart1 = Kart("Kart A", "200", 150)
    piloto1 = Piloto("João", False)

    piloto1.soltaSuperPoder()
    kart1.pular()
    kart1.mostraInfo()


if __name__ == "__main__":
    main()
