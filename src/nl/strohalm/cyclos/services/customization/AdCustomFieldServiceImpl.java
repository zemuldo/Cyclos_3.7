/*
    This file is part of Cyclos (www.cyclos.org).
    A project of the Social Trade Organisation (www.socialtrade.org).

    Cyclos is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    Cyclos is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Cyclos; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 */
package nl.strohalm.cyclos.services.customization;

import nl.strohalm.cyclos.entities.ads.Ad;
import nl.strohalm.cyclos.entities.ads.imports.ImportedAd;
import nl.strohalm.cyclos.entities.customization.fields.AdCustomField;
import nl.strohalm.cyclos.entities.customization.fields.CustomField;
import nl.strohalm.cyclos.utils.validation.Validator;

/**
 * Implementation for {@link AdCustomFieldServiceLocal}
 * 
 * @author luis
 */
public class AdCustomFieldServiceImpl extends BaseGlobalCustomFieldServiceImpl<AdCustomField> implements AdCustomFieldServiceLocal {

    public AdCustomFieldServiceImpl() {
        super(AdCustomField.class, CustomField.Nature.AD);
    }

    public Validator getValueValidator() {
        return getValueValidator(list());
    }

    public void saveValues(final Ad ad) {
        getValueValidator().validate(ad);
        doSaveValues(ad);
    }

    public void saveValues(final ImportedAd importedAd) {
        getValueValidator().validate(importedAd);
        doSaveValues(importedAd);
    }

}
