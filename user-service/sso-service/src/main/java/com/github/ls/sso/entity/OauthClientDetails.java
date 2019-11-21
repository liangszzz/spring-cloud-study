package com.github.ls.sso.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "oauth_client_details")
public class OauthClientDetails {

    @Id
    @Column(name = "client_id")
    private String clientId;

    @Column(name = "resource_ids")
    private String resourceIds;

    @Column(name = "client_secret")
    private String clientSecret;

    @Column(name = "scope")
    private String scope;

    @Column(name = "authorized_grant_types")
    private String authorizedGrantTypes;

    @Column(name = "web_server_redirect_uri")
    private String webServerRedirectUri;

    @Column(name = "authorities")
    private String authorities;

    @Column(name = "access_token_validity")
    private Long accessTokenValidity;

    @Column(name = "refresh_token_validity")
    private Long refreshTokenValidity;

    @Column(name = "additional_information")
    private String additionalInformation;

    @Column(name = "autoapprove")
    private String autoapprove;
}
