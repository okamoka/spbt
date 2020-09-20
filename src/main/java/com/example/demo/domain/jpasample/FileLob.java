package com.example.demo.domain.jpasample;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class FileLob {
	@Id
	@GeneratedValue
	private Long id;
	private String description;

    private Long tid;


	@Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length=10000000)
	private byte[] picture;
    
    public FileLob(String description, Long tid, byte[] picture) {
        this.description = description;
        this.tid = tid;
        this.picture = picture;
    }
    
}
