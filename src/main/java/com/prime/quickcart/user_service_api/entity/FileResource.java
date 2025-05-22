package com.prime.quickcart.user_service_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class FileResource {
    @Lob
    @Column(name = "file_name")
    private byte[] fileName;
    @Lob
    @Column(name = "resource_url")
    private byte[] resourceUrl;
    @Lob
    @Column(name = "hash")
    private byte[] hash;
    @Lob
    @Column(name = "directory")
    private byte[] directory;
}
