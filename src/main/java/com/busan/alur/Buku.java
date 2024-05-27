package com.busan.alur;



/**
 * Class Buku
 */
public class Buku {

  //
  // Fields
  //

  public String judul;
  public Person author;
  public int tahunPenerbitan;
  public Harga harga;
  private PerusahaanBuku penerbit;
  
  //
  // Constructors
  //
  public Buku () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of judul
   * @param newVar the new value of judul
   */
  public void setJudul (String newVar) {
    judul = newVar;
  }

  /**
   * Get the value of judul
   * @return the value of judul
   */
  public String getJudul () {
    return judul;
  }

  /**
   * Set the value of author
   * @param newVar the new value of author
   */
  public void setAuthor (Person newVar) {
    author = newVar;
  }

  /**
   * Get the value of author
   * @return the value of author
   */
  public Person getAuthor () {
    return author;
  }

  /**
   * Set the value of tahunPenerbitan
   * @param newVar the new value of tahunPenerbitan
   */
  public void setTahunPenerbitan (int newVar) {
    tahunPenerbitan = newVar;
  }

  /**
   * Get the value of tahunPenerbitan
   * @return the value of tahunPenerbitan
   */
  public int getTahunPenerbitan () {
    return tahunPenerbitan;
  }

  /**
   * Set the value of harga
   * @param newVar the new value of harga
   */
  public void setHarga (Harga newVar) {
    harga = newVar;
  }

  /**
   * Get the value of harga
   * @return the value of harga
   */
  public Harga getHarga () {
    return harga;
  }

  /**
   * Set the value of penerbit
   * @param newVar the new value of penerbit
   */
  public void setPenerbit (PerusahaanBuku newVar) {
    penerbit = newVar;
  }

  /**
   * Get the value of penerbit
   * @return the value of penerbit
   */
  public PerusahaanBuku getPenerbit () {
    return penerbit;
  }

  //
  // Other methods
  //

}
