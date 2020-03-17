package com.company;

public class Prenda {

        private String marca;
        private String modelo;

        public Prenda(String marca,String modelo){
                this.modelo = modelo;
                this.marca = marca;
        }

        public String getMarca() {
                return marca;
        }

        public void setMarca(String marca) {
                this.marca = marca;
        }

        public String getModelo() {
                return modelo;
        }

        public void setModelo(String modelo) {
                this.modelo = modelo;
        }

        @Override
        public String toString() {
                return "Prenda{" + "marca='" + marca + '\'' + ", modelo='" + modelo + '\'' + '}';
        }

        //equals

        /**
         * Lo primero que tenemos que comparar es si son de la misma clase
         * @param objectoAComparar
         * @return
         */
        @Override
        public boolean equals(Object objectoAComparar){
                //simple verificacion de "¿Eres de la clase Prenda?
                if (! (objectoAComparar instanceof Prenda)){
                    return false;
                }

                Prenda prendaAComprar = (Prenda) objectoAComparar;

                return  prendaAComprar.getMarca().equals(this.marca) &&
                        prendaAComprar.getModelo().equals(this.modelo);
        }




}
