package dev.hossam.data.room

import androidx.room.TypeConverter
import com.google.gson.Gson
import dev.hossam.local.TeamMember

class TeamMemberConverter {

    @TypeConverter
    fun toJson(teamMember: TeamMember): String = Gson().toJson(teamMember)

    @TypeConverter
    fun toTeamMember(string: String): TeamMember = Gson().fromJson(string, TeamMember::class.java)

}