/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geoserver.security.password;

import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

/**
 *
 * @author Adrian Weber, Centre for Development and Environment
 */
public class GeoServerMd5PasswordEncoder extends AbstractGeoserverPasswordEncoder {

    public GeoServerMd5PasswordEncoder() {
        setReversible(false);
    }

    @Override
    protected PasswordEncoder createStringEncoder() {
        return new Md5PasswordEncoder();
    }

    @Override
    protected CharArrayPasswordEncoder createCharEncoder() {
        return new CharArrayPasswordEncoder() {

            Md5PasswordEncoder encoder = new Md5PasswordEncoder();

            @Override
            public boolean isPasswordValid(String encPass, char[] rawPass, Object salt) {
                return encoder.isPasswordValid(encPass, new String(rawPass), salt);
            }

            @Override
            public String encodePassword(char[] rawPass, Object salt) {
                return encoder.encodePassword(new String(rawPass), salt);
            }
        };
    }

    @Override
    public PasswordEncodingType getEncodingType() {
        return PasswordEncodingType.DIGEST;
    }
}
