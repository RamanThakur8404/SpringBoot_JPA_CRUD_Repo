package com.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;

//@Data
//@Entity
////@AllArgsConstructor
//@RequiredArgsConstructor
//@NoArgsConstructor
//@Table(name="ARTIST_INFO")
//public class Artist {
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  @Column(name="artistId")
//  private Integer artistId;
//
//  @NonNull
//  @Column(name="artistName",length=40)
//  private String artistName;
//
//  @NonNull
//  @Column(name="artistCategory",length =30)
//  private String artistCategory;
//
//  @NonNull
//  @Column(name="artistFees")
//  private Double fees;
//
////  public Artist( @NonNull String artistName, @NonNull String artistCategory, @NonNull Double fees) {
////    this.artistName = artistName;
////    this.artistCategory = artistCategory;
////    this.fees = fees;
////  }

@Data
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "ARTIST_INFO")
public class Artist {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "artistId")
  private Integer artistId;

  @NonNull
  @Column(name = "artistName", length = 40)
  private String artistName;

  @NonNull
  @Column(name = "artistCategory", length = 30)
  private String artistCategory;

  @NonNull
  @Column(name = "artistFees")
  private Double fees;

  public Artist(@NonNull String artistName, @NonNull String artistCategory, @NonNull Double fees) {
  this.artistName =artistName;
  this.artistCategory =artistCategory;
  this.fees =fees;
}

  public Integer getArtistId() {
    return artistId;
  }
}


