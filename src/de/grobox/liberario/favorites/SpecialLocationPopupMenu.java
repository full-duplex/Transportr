/*    Transportr
 *    Copyright (C) 2013 - 2016 Torsten Grote
 *
 *    This program is Free Software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as
 *    published by the Free Software Foundation, either version 3 of the
 *    License, or (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.grobox.liberario.favorites;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;

import de.grobox.liberario.R;

class SpecialLocationPopupMenu extends AbstractFavoritesPopupMenu {

	SpecialLocationPopupMenu(Context context, View anchor, FavoritesItem trip) {
		super(context, anchor, trip);
	}

	@Override
	protected int getMenuRes() {
		return R.menu.special_location_actions;
	}

	@Override
	public boolean onMenuItemClick(MenuItem item) {
		switch (item.getItemId()) {
			default:
				return super.onMenuItemClick(item);
		}
	}

}
